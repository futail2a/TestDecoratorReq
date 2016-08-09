package RTC;

/**
* RTC/CameraInfoHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class CameraInfoHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.CameraInfo value = null;

  public CameraInfoHolder ()
  {
  }

  public CameraInfoHolder (RTC.CameraInfo initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.CameraInfoHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.CameraInfoHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.CameraInfoHelper.type ();
  }

}
