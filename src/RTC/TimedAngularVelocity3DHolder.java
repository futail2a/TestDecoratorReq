package RTC;

/**
* RTC/TimedAngularVelocity3DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class TimedAngularVelocity3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedAngularVelocity3D value = null;

  public TimedAngularVelocity3DHolder ()
  {
  }

  public TimedAngularVelocity3DHolder (RTC.TimedAngularVelocity3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedAngularVelocity3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedAngularVelocity3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedAngularVelocity3DHelper.type ();
  }

}
