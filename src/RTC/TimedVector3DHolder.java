package RTC;

/**
* RTC/TimedVector3DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class TimedVector3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedVector3D value = null;

  public TimedVector3DHolder ()
  {
  }

  public TimedVector3DHolder (RTC.TimedVector3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedVector3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedVector3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedVector3DHelper.type ();
  }

}
