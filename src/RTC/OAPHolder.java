package RTC;

/**
* RTC/OAPHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class OAPHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.OAP value = null;

  public OAPHolder ()
  {
  }

  public OAPHolder (RTC.OAP initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.OAPHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.OAPHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.OAPHelper.type ();
  }

}
