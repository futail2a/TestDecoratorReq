package RTC;

/**
* RTC/PointCloudPointHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��38�b JST
*/

public final class PointCloudPointHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.PointCloudPoint value = null;

  public PointCloudPointHolder ()
  {
  }

  public PointCloudPointHolder (RTC.PointCloudPoint initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.PointCloudPointHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.PointCloudPointHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.PointCloudPointHelper.type ();
  }

}
