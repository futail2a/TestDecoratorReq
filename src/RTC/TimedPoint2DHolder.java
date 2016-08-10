package RTC;

/**
* RTC/TimedPoint2DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class TimedPoint2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedPoint2D value = null;

  public TimedPoint2DHolder ()
  {
  }

  public TimedPoint2DHolder (RTC.TimedPoint2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedPoint2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedPoint2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedPoint2DHelper.type ();
  }

}
