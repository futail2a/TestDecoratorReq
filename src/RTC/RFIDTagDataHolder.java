package RTC;


/**
* RTC/RFIDTagDataHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��38�b JST
*/


/*!
     * @typedef RFIDTagData
     */
public final class RFIDTagDataHolder implements org.omg.CORBA.portable.Streamable
{
  public byte value[] = null;

  public RFIDTagDataHolder ()
  {
  }

  public RFIDTagDataHolder (byte[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.RFIDTagDataHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.RFIDTagDataHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.RFIDTagDataHelper.type ();
  }

}
