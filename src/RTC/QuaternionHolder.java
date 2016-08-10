package RTC;

/**
* RTC/QuaternionHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class QuaternionHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Quaternion value = null;

  public QuaternionHolder ()
  {
  }

  public QuaternionHolder (RTC.Quaternion initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.QuaternionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.QuaternionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.QuaternionHelper.type ();
  }

}
