package RTC;


/**
* RTC/MulticameraImageListHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/


/*!
     * @typedef MulticameraImageList
     */
public final class MulticameraImageListHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.CameraImage value[] = null;

  public MulticameraImageListHolder ()
  {
  }

  public MulticameraImageListHolder (RTC.CameraImage[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.MulticameraImageListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.MulticameraImageListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.MulticameraImageListHelper.type ();
  }

}
