package RTC;


/**
* RTC/MulticameraInfoListHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/


/*!
     * @typedef MulticameraInfoList
     */
public final class MulticameraInfoListHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.CameraInfo value[] = null;

  public MulticameraInfoListHolder ()
  {
  }

  public MulticameraInfoListHolder (RTC.CameraInfo[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.MulticameraInfoListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.MulticameraInfoListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.MulticameraInfoListHelper.type ();
  }

}
