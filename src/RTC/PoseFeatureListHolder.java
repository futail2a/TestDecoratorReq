package RTC;


/**
* RTC/PoseFeatureListHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��38�b JST
*/


/*!
     * @typedef PoseFeatureList
     */
public final class PoseFeatureListHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.PoseFeature value[] = null;

  public PoseFeatureListHolder ()
  {
  }

  public PoseFeatureListHolder (RTC.PoseFeature[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.PoseFeatureListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.PoseFeatureListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.PoseFeatureListHelper.type ();
  }

}
