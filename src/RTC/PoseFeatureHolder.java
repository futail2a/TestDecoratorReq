package RTC;

/**
* RTC/PoseFeatureHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/

public final class PoseFeatureHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.PoseFeature value = null;

  public PoseFeatureHolder ()
  {
  }

  public PoseFeatureHolder (RTC.PoseFeature initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.PoseFeatureHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.PoseFeatureHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.PoseFeatureHelper.type ();
  }

}
