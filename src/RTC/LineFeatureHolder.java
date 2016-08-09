package RTC;

/**
* RTC/LineFeatureHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��38�b JST
*/

public final class LineFeatureHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.LineFeature value = null;

  public LineFeatureHolder ()
  {
  }

  public LineFeatureHolder (RTC.LineFeature initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.LineFeatureHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.LineFeatureHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.LineFeatureHelper.type ();
  }

}
