package RTC;

/**
* RTC/Geometry2DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��36�b JST
*/

public final class Geometry2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Geometry2D value = null;

  public Geometry2DHolder ()
  {
  }

  public Geometry2DHolder (RTC.Geometry2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Geometry2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Geometry2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Geometry2DHelper.type ();
  }

}
