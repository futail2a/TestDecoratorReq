package RTC;

/**
* RTC/FiducialFOVHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class FiducialFOVHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.FiducialFOV value = null;

  public FiducialFOVHolder ()
  {
  }

  public FiducialFOVHolder (RTC.FiducialFOV initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.FiducialFOVHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.FiducialFOVHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.FiducialFOVHelper.type ();
  }

}
