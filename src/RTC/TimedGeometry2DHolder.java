package RTC;

/**
* RTC/TimedGeometry2DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class TimedGeometry2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedGeometry2D value = null;

  public TimedGeometry2DHolder ()
  {
  }

  public TimedGeometry2DHolder (RTC.TimedGeometry2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedGeometry2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedGeometry2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedGeometry2DHelper.type ();
  }

}
