package RTC;

/**
* RTC/Velocity2DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class Velocity2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Velocity2D value = null;

  public Velocity2DHolder ()
  {
  }

  public Velocity2DHolder (RTC.Velocity2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Velocity2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Velocity2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Velocity2DHelper.type ();
  }

}
