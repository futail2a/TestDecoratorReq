package RTC;

/**
* RTC/GPSFixTypeHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/


/*!
     * @enum GPSFixType
     */
public final class GPSFixTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.GPSFixType value = null;

  public GPSFixTypeHolder ()
  {
  }

  public GPSFixTypeHolder (RTC.GPSFixType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.GPSFixTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.GPSFixTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.GPSFixTypeHelper.type ();
  }

}
