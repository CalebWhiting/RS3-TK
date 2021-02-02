cmake_minimum_required(VERSION 3.16)
project(XcbBindings)

set(CMAKE_CXX_STANDARD 11)
set(CMAKE_BUILD_TYPE Debug)
set(CMAKE_MODULE_PATH ${CMAKE_MODULE_PATH} /usr/share/ECM/find-modules/)

set(JAVA_HOME /usr/lib/jvm/java-14-openjdk-amd64/)
add_compile_definitions(DEBUG)

# Show all warnings
if(MSVC)
  # Force to always compile with W4
  if(CMAKE_CXX_FLAGS MATCHES "/W[0-4]")
    string(REGEX REPLACE "/W[0-4]" "/W4" CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS}")
  else()
    set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} /W4")
  endif()
elseif(CMAKE_COMPILER_IS_GNUCC OR CMAKE_COMPILER_IS_GNUCXX)
  # Update if necessary
  set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -Wall -Wno-long-long -pedantic")
endif()

set(GENERATED_SOURCES target/generated-sources)
set(CXX_SOURCES src/main/cxx)

set(SRC_FILES
    ${CXX_SOURCES}/LibXcbBindings.hpp
    ${CXX_SOURCES}/NativeUtils.cpp
    ${CXX_SOURCES}/XInternal.cpp
    ${CXX_SOURCES}/XStructs.cpp
    ${CXX_SOURCES}/XAtomEnum.cpp
    ${CXX_SOURCES}/XImageFormatEnum.cpp
    ${CXX_SOURCES}/XcbUtils.cpp)

find_package(JNI REQUIRED)
find_package(XCB REQUIRED)

add_library(${PROJECT_NAME} SHARED ${SRC_FILES})

target_include_directories(${PROJECT_NAME} PRIVATE
    ${JNI_INCLUDE_DIRS}
    ${XCB_INCLUDE_DIRS}
    ${GENERATED_SOURCES}/cxx)

target_link_libraries(${PROJECT_NAME} ${JNI_LIBRARIES} ${XCB_LIBRARIES})
