package RTC;

/**
* RTC/TimedOrientation3DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class TimedOrientation3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedOrientation3D value = null;

  public TimedOrientation3DHolder ()
  {
  }

  public TimedOrientation3DHolder (RTC.TimedOrientation3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedOrientation3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedOrientation3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedOrientation3DHelper.type ();
  }

}
