package RTC;

/**
* RTC/LimbStatusHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/


/*!
     * @enum LimbStatus
     */
public final class LimbStatusHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.LimbStatus value = null;

  public LimbStatusHolder ()
  {
  }

  public LimbStatusHolder (RTC.LimbStatus initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.LimbStatusHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.LimbStatusHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.LimbStatusHelper.type ();
  }

}
