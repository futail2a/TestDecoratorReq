package RTC;


/**
* RTC/GPSFixType.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/


/*!
     * @enum GPSFixType
     */
public class GPSFixType implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 3;
  private static RTC.GPSFixType[] __array = new RTC.GPSFixType [__size];

  public static final int _GPS_FIX_NONE = 0;
  public static final RTC.GPSFixType GPS_FIX_NONE = new RTC.GPSFixType(_GPS_FIX_NONE);
  public static final int _GPS_FIX_NORMAL = 1;
  public static final RTC.GPSFixType GPS_FIX_NORMAL = new RTC.GPSFixType(_GPS_FIX_NORMAL);
  public static final int _GPS_FIX_DGPS = 2;
  public static final RTC.GPSFixType GPS_FIX_DGPS = new RTC.GPSFixType(_GPS_FIX_DGPS);

  public int value ()
  {
    return __value;
  }

  public static RTC.GPSFixType from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected GPSFixType (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class GPSFixType
