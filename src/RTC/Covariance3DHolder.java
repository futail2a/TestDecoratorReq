package RTC;

/**
* RTC/Covariance3DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class Covariance3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Covariance3D value = null;

  public Covariance3DHolder ()
  {
  }

  public Covariance3DHolder (RTC.Covariance3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Covariance3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Covariance3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Covariance3DHelper.type ();
  }

}
