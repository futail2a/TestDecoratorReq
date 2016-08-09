package RTC;

/**
* RTC/TimedCovariance3DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class TimedCovariance3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedCovariance3D value = null;

  public TimedCovariance3DHolder ()
  {
  }

  public TimedCovariance3DHolder (RTC.TimedCovariance3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedCovariance3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedCovariance3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedCovariance3DHelper.type ();
  }

}
