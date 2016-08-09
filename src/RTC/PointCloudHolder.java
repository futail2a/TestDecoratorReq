package RTC;

/**
* RTC/PointCloudHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��38�b JST
*/

public final class PointCloudHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.PointCloud value = null;

  public PointCloudHolder ()
  {
  }

  public PointCloudHolder (RTC.PointCloud initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.PointCloudHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.PointCloudHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.PointCloudHelper.type ();
  }

}
