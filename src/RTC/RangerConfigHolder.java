package RTC;

/**
* RTC/RangerConfigHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/

public final class RangerConfigHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.RangerConfig value = null;

  public RangerConfigHolder ()
  {
  }

  public RangerConfigHolder (RTC.RangerConfig initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.RangerConfigHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.RangerConfigHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.RangerConfigHelper.type ();
  }

}
