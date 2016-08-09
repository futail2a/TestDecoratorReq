package RTC;

/**
* RTC/TimedAcceleration3DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class TimedAcceleration3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedAcceleration3D value = null;

  public TimedAcceleration3DHolder ()
  {
  }

  public TimedAcceleration3DHolder (RTC.TimedAcceleration3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedAcceleration3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedAcceleration3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedAcceleration3DHelper.type ();
  }

}
