package RTC;

/**
* RTC/TimedVelocity2DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class TimedVelocity2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedVelocity2D value = null;

  public TimedVelocity2DHolder ()
  {
  }

  public TimedVelocity2DHolder (RTC.TimedVelocity2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedVelocity2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedVelocity2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedVelocity2DHelper.type ();
  }

}