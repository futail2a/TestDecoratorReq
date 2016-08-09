package RTC;

/**
* RTC/GPSDataHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class GPSDataHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.GPSData value = null;

  public GPSDataHolder ()
  {
  }

  public GPSDataHolder (RTC.GPSData initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.GPSDataHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.GPSDataHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.GPSDataHelper.type ();
  }

}
