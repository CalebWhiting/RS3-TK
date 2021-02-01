#include "LibXcbBindings.hpp"

std::string xcb_error_name(xcb_generic_error_t* e) {
    switch(e->error_code) {
        case XCB_CONN_ERROR: return "XCB_CONN_ERROR";
        case XCB_CONN_CLOSED_MEM_INSUFFICIENT: return "XCB_CONN_CLOSED_MEM_INSUFFICIENT";
        case XCB_CONN_CLOSED_EXT_NOTSUPPORTED: return "XCB_CONN_CLOSED_EXT_NOTSUPPORTED";
        case XCB_CONN_CLOSED_REQ_LEN_EXCEED: return "XCB_CONN_CLOSED_REQ_LEN_EXCEED";
        case XCB_CONN_CLOSED_PARSE_ERR: return "XCB_CONN_CLOSED_PARSE_ERR";
        case XCB_CONN_CLOSED_INVALID_SCREEN: return "XCB_CONN_CLOSED_INVALID_SCREEN";
        case XCB_CONN_CLOSED_FDPASSING_FAILED: return "XCB_CONN_CLOSED_FDPASSING_FAILED";
    }
    return "XCB_UNKNOWN_ERROR_" + std::to_string(e->error_code);
}