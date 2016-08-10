package RTC;


/**
* RTC/FiducialInfoListHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/


/*!
     * @typedef FiducialInfoList
     */
public final class FiducialInfoListHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.FiducialInfo value[] = null;

  public FiducialInfoListHolder ()
  {
  }

  public FiducialInfoListHolder (RTC.FiducialInfo[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.FiducialInfoListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.FiducialInfoListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.FiducialInfoListHelper.type ();
  }

}
