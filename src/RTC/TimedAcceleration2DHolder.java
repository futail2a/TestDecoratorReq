package RTC;

/**
* RTC/TimedAcceleration2DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class TimedAcceleration2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedAcceleration2D value = null;

  public TimedAcceleration2DHolder ()
  {
  }

  public TimedAcceleration2DHolder (RTC.TimedAcceleration2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedAcceleration2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedAcceleration2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedAcceleration2DHelper.type ();
  }

}
