package RTC;

/**
* RTC/LimbStateHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/

public final class LimbStateHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.LimbState value = null;

  public LimbStateHolder ()
  {
  }

  public LimbStateHolder (RTC.LimbState initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.LimbStateHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.LimbStateHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.LimbStateHelper.type ();
  }

}
