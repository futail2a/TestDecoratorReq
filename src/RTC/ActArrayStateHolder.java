package RTC;

/**
* RTC/ActArrayStateHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/

public final class ActArrayStateHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.ActArrayState value = null;

  public ActArrayStateHolder ()
  {
  }

  public ActArrayStateHolder (RTC.ActArrayState initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.ActArrayStateHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.ActArrayStateHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.ActArrayStateHelper.type ();
  }

}
