package RTC;

/**
* RTC/TimedSpeedHeading3DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class TimedSpeedHeading3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedSpeedHeading3D value = null;

  public TimedSpeedHeading3DHolder ()
  {
  }

  public TimedSpeedHeading3DHolder (RTC.TimedSpeedHeading3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedSpeedHeading3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedSpeedHeading3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedSpeedHeading3DHelper.type ();
  }

}
