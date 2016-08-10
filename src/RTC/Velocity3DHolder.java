package RTC;

/**
* RTC/Velocity3DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class Velocity3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Velocity3D value = null;

  public Velocity3DHolder ()
  {
  }

  public Velocity3DHolder (RTC.Velocity3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Velocity3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Velocity3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Velocity3DHelper.type ();
  }

}
