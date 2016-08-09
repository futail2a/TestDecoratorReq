package RTC;

/**
* RTC/GPSTimeHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class GPSTimeHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.GPSTime value = null;

  public GPSTimeHolder ()
  {
  }

  public GPSTimeHolder (RTC.GPSTime initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.GPSTimeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.GPSTimeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.GPSTimeHelper.type ();
  }

}
