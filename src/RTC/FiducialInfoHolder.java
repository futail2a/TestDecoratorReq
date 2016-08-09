package RTC;

/**
* RTC/FiducialInfoHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class FiducialInfoHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.FiducialInfo value = null;

  public FiducialInfoHolder ()
  {
  }

  public FiducialInfoHolder (RTC.FiducialInfo initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.FiducialInfoHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.FiducialInfoHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.FiducialInfoHelper.type ();
  }

}
