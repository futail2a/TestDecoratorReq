package RTC;

/**
* RTC/TimedGeometry3DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class TimedGeometry3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedGeometry3D value = null;

  public TimedGeometry3DHolder ()
  {
  }

  public TimedGeometry3DHolder (RTC.TimedGeometry3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedGeometry3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedGeometry3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedGeometry3DHelper.type ();
  }

}
