package RTC;

/**
* RTC/TimedSpeedHeading2DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class TimedSpeedHeading2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedSpeedHeading2D value = null;

  public TimedSpeedHeading2DHolder ()
  {
  }

  public TimedSpeedHeading2DHolder (RTC.TimedSpeedHeading2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedSpeedHeading2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedSpeedHeading2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedSpeedHeading2DHelper.type ();
  }

}
