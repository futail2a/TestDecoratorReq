package RTC;

/**
* RTC/Orientation3DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class Orientation3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Orientation3D value = null;

  public Orientation3DHolder ()
  {
  }

  public Orientation3DHolder (RTC.Orientation3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Orientation3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Orientation3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Orientation3DHelper.type ();
  }

}
