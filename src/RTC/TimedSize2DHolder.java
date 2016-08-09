package RTC;

/**
* RTC/TimedSize2DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class TimedSize2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedSize2D value = null;

  public TimedSize2DHolder ()
  {
  }

  public TimedSize2DHolder (RTC.TimedSize2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedSize2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedSize2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedSize2DHelper.type ();
  }

}
