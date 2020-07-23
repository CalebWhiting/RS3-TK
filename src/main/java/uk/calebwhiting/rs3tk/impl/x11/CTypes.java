package uk.calebwhiting.rs3tk.impl.x11;

import com.sun.jna.IntegerType;
import com.sun.jna.Structure;

public class CTypes {
  public static class UInt8 extends IntegerType {
    public static final int BITS = 8;
    public static final int SIZE = BITS / 8;

    public UInt8() {
      super(SIZE, 0, true);
    }

    public UInt8(long value) {
      super(SIZE, value, true);
    }

    public static class ByReference extends UInt8 implements Structure.ByReference { }
    public static class ByValue extends UInt8 implements Structure.ByValue { }
  }
  public static class UInt16 extends IntegerType {
    public static final int BITS = 16;
    public static final int SIZE = BITS / 8;

    public UInt16() {
      super(SIZE, 0, true);
    }

    public UInt16(long value) {
      super(SIZE, value, true);
    }

    public static class ByReference extends UInt16 implements Structure.ByReference { }
    public static class ByValue extends UInt16 implements Structure.ByValue { }
  }
  public static class UInt24 extends IntegerType {
    public static final int BITS = 24;
    public static final int SIZE = BITS / 8;

    public UInt24() {
      super(SIZE, 0, true);
    }

    public UInt24(long value) {
      super(SIZE, value, true);
    }

    public static class ByReference extends UInt24 implements Structure.ByReference { }
    public static class ByValue extends UInt24 implements Structure.ByValue { }
  }
  public static class UInt32 extends IntegerType {
    public static final int BITS = 32;
    public static final int SIZE = BITS / 8;

    public UInt32() {
      super(SIZE, 0, true);
    }

    public UInt32(long value) {
      super(SIZE, value, true);
    }

    public static class ByReference extends UInt32 implements Structure.ByReference { }
    public static class ByValue extends UInt32 implements Structure.ByValue { }
  }
  public static class UInt64 extends IntegerType {
    public static final int BITS = 64;
    public static final int SIZE = BITS / 8;

    public UInt64() {
      super(SIZE, 0, true);
    }

    public UInt64(long value) {
      super(SIZE, value, true);
    }

    public static class ByReference extends UInt64 implements Structure.ByReference { }
    public static class ByValue extends UInt64 implements Structure.ByValue { }
  }
  public static class Int8 extends IntegerType {
    public static final int BITS = 8;
    public static final int SIZE = BITS / 8;

    public Int8() {
      super(SIZE, 0, false);
    }

    public Int8(long value) {
      super(SIZE, value, false);
    }

    public static class ByReference extends Int8 implements Structure.ByReference { }
    public static class ByValue extends Int8 implements Structure.ByValue { }
  }
  public static class Int16 extends IntegerType {
    public static final int BITS = 16;
    public static final int SIZE = BITS / 8;

    public Int16() {
      super(SIZE, 0, false);
    }

    public Int16(long value) {
      super(SIZE, value, false);
    }

    public static class ByReference extends Int16 implements Structure.ByReference { }
    public static class ByValue extends Int16 implements Structure.ByValue { }
  }
  public static class Int24 extends IntegerType {
    public static final int BITS = 24;
    public static final int SIZE = BITS / 8;

    public Int24() {
      super(SIZE, 0, false);
    }

    public Int24(long value) {
      super(SIZE, value, false);
    }

    public static class ByReference extends Int24 implements Structure.ByReference { }
    public static class ByValue extends Int24 implements Structure.ByValue { }
  }
  public static class Int32 extends IntegerType {
    public static final int BITS = 32;
    public static final int SIZE = BITS / 8;

    public Int32() {
      super(SIZE, 0, false);
    }

    public Int32(long value) {
      super(SIZE, value, false);
    }

    public static class ByReference extends Int32 implements Structure.ByReference { }
    public static class ByValue extends Int32 implements Structure.ByValue { }
  }
  public static class Int64 extends IntegerType {
    public static final int BITS = 64;
    public static final int SIZE = BITS / 8;

    public Int64() {
      super(SIZE, 0, false);
    }

    public Int64(long value) {
      super(SIZE, value, false);
    }

    public static class ByReference extends Int64 implements Structure.ByReference { }
    public static class ByValue extends Int64 implements Structure.ByValue { }
  }
}
