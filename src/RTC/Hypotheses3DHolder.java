package RTC;

/**
* RTC/Hypotheses3DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/

public final class Hypotheses3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Hypotheses3D value = null;

  public Hypotheses3DHolder ()
  {
  }

  public Hypotheses3DHolder (RTC.Hypotheses3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Hypotheses3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Hypotheses3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Hypotheses3DHelper.type ();
  }

}
