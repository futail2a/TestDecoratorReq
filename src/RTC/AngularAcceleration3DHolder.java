package RTC;

/**
* RTC/AngularAcceleration3DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class AngularAcceleration3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.AngularAcceleration3D value = null;

  public AngularAcceleration3DHolder ()
  {
  }

  public AngularAcceleration3DHolder (RTC.AngularAcceleration3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.AngularAcceleration3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.AngularAcceleration3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.AngularAcceleration3DHelper.type ();
  }

}
