package RTC;


/**
* RTC/GPSTime.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/

public final class GPSTime implements org.omg.CORBA.portable.IDLEntity
{

  /// Seconds value.
  public int sec = (int)0;

  /// Microseconds value.
  public int msec = (int)0;

  public GPSTime ()
  {
  } // ctor

  public GPSTime (int _sec, int _msec)
  {
    sec = _sec;
    msec = _msec;
  } // ctor

} // class GPSTime
