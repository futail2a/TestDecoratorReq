package RTC;

/**
* RTC/Vector2DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class Vector2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Vector2D value = null;

  public Vector2DHolder ()
  {
  }

  public Vector2DHolder (RTC.Vector2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Vector2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Vector2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Vector2DHelper.type ();
  }

}
