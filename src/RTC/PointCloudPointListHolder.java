package RTC;


/**
* RTC/PointCloudPointListHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/


/*!
     * @typedef PointCloudPointList
     */
public final class PointCloudPointListHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.PointCloudPoint value[] = null;

  public PointCloudPointListHolder ()
  {
  }

  public PointCloudPointListHolder (RTC.PointCloudPoint[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.PointCloudPointListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.PointCloudPointListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.PointCloudPointListHelper.type ();
  }

}
