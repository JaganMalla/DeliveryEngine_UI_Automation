package com.hp.exstream.qa.bean;

public class AddPhasesBean {

	//Common
	private String Phasetype;
	private String[] AvailableFiles;
	private String[] SelectedFiles;
	private String phasename;
	private boolean SavetosharedPhase;
	private String Sharedphasename;
	private boolean ActionOnErrContn;
	private boolean ActionOnErrStop;
	

	
	public String getPhasetype() {
		return Phasetype;
	}
	public void setPhasetype(String Phasetype) {
		this.Phasetype = Phasetype;
	}
	
	public String getphaseName() {
		return phasename;
	}
	public void setphaseName(String phasename) {
		this.phasename = phasename;
	}
	
	public boolean isSavetosharedPhase() {
		return SavetosharedPhase;
	}
	public void setSavetosharedPhase(boolean SavetosharedPhase) {
		this.SavetosharedPhase = SavetosharedPhase;
	}	
	
	public String getSharedphasename() {
		return Sharedphasename;
	}
	public void setSharedphasename(String Sharedphasename) {
		this.Sharedphasename = Sharedphasename;
	}
	
	public String[] getAvailableFiles() {
		return AvailableFiles;
	}
	public void setAvailableFiles(String[] AvailableFiles) {
		this.AvailableFiles = AvailableFiles;
	}
	
	public String[] getSelectedFiles() {
		return SelectedFiles;
	}
	public void setSelectedFiles(String[] SelectedFiles) {
		this.SelectedFiles = SelectedFiles;
	}
	
	public boolean isActionOnErrContn() {
		return ActionOnErrContn;
	}
	public void setActionOnErrContn(boolean ActionOnErrContn) {
		this.ActionOnErrContn = ActionOnErrContn;
	}	
	
	public boolean isActionOnErrStop() {
		return ActionOnErrStop;
	}
	public void setActionOnErrStop(boolean ActionOnErrStop) {
		this.ActionOnErrStop = ActionOnErrStop;
	}	
	
	///Common update variable list///
	private String Updatephasename;
	
	public String getUpdatephasename() {
		return Updatephasename;
	}
	public void setUpdatephasename(String Updatephasename) {
		this.Updatephasename = Updatephasename;
	}
	
	
	

	//**************Cleanup********************
	private String cldelusrdeffile;
	
	public String getcldelusrdeffile() {
	return cldelusrdeffile;
	}
	public void setcldelusrdeffile(String cldelusrdeffile) {
		this.cldelusrdeffile = cldelusrdeffile;
	}
	
	//**************Delivery********************
	
	private String dlselectqueue;
	private String dlfilepattern;
	private String dlconditiontype;
	private String dlelapsedtime;
	
	public String getdlselectqueue() {
	return dlselectqueue;
	}
	public void setdlselectqueue(String dlselectqueue) {
		this.dlselectqueue = dlselectqueue;
	}
	
	public String getdlfilepattern() {
	return dlfilepattern;
	}
	public void setdlfilepattern(String dlfilepattern) {
		this.dlfilepattern = dlfilepattern;
	}
	
	public String getdlconditiontype() {
	return dlconditiontype;
	}
	public void setdlconditiontype(String dlconditiontype) {
		this.dlconditiontype = dlconditiontype;
	}
	
	public String getdlelapsedtime() {
	return dlelapsedtime;
	}
	public void setdlelapsedtime(String dlelapsedtime) {
		this.dlelapsedtime = dlelapsedtime;
	}
	
	//**********************************

	//**************message********************
	private String msgaddsubname;
	private String msgchanltype;
	private String msgchanlname;
	private String msgto;
	private String msgsubject;
	private String msgsubmessage;
	private String msgattachfilename;
	
	public String getmsgaddsubname() {
	return msgaddsubname;
	}
	public void setmsgaddsubname(String msgaddsubname) {
		this.msgaddsubname = msgaddsubname;
	}
	
	public String getmsgchanltype() {
	return msgchanltype;
	}
	public void setmsgchanltype(String msgchanltype) {
		this.msgchanltype = msgchanltype;
	}
	
	public String getmsgchanlname() {
	return msgchanlname;
	}
	public void setmsgchanlname(String msgchanlname) {
		this.msgchanlname = msgchanlname;
	}
	
	public String getmsgto() {
	return msgto;
	}
	public void setmsgto(String msgto) {
		this.msgto = msgto;
	}
	
	
	public String getmsgsubject() {
	return msgsubject;
	}
	public void setmsgsubject(String msgsubject) {
		this.msgsubject = msgsubject;
	}
	
	public String getmsgsubmessage() {
	return msgsubmessage;
	}
	public void setmsgsubmessage(String msgsubmessage) {
		this.msgsubmessage = msgsubmessage;
	}
	
	public String getmsgattachfilename() {
	return msgattachfilename;
	}
	public void setmsgattachfilename(String msgattachfilename) {
		this.msgattachfilename = msgattachfilename;
	}
	
	//**********************************
	private String jsjavascritcode; 
	private boolean jsreportandcontinue; 
	private boolean jsreportandstop; 
	
	public String getjsjavascritcode() {
	return jsjavascritcode;
	}
	public void setjsjavascritcode(String jsjavascritcode) {
		this.jsjavascritcode = jsjavascritcode;
	}
	
	public boolean isjsreportandcontinue() {
		return jsreportandcontinue;
	}
	public void setjsreportandcontinue(boolean jsreportandcontinue) {
		this.jsreportandcontinue = jsreportandcontinue;
	}	
	
	public boolean isjsreportandstop() {
		return jsreportandstop;
	}
	public void setjsreportandstop(boolean jsreportandstop) {
		this.jsreportandstop = jsreportandstop;
	}	
	
	/////SORT FILE COMPOSITION /////////////
	private String sfmergedsortindex; 
	private boolean sfcopysortdatafile; 
	
	public String getsfmergedsortindex() {
	return sfmergedsortindex;
	}
	public void setsfmergedsortindex(String sfmergedsortindex) {
		this.sfmergedsortindex = sfmergedsortindex;
	}
	
	public boolean issfcopysortdatafile() {
		return sfcopysortdatafile;
	}
	public void setsfcopysortdatafile(boolean sfcopysortdatafile) {
		this.sfcopysortdatafile = sfcopysortdatafile;
	}
	
	//Real time composition
    
	private String rtapplication;
	private String rtinfile;
	private String rtopfile;
	private String rttimeout;
	private String rtheadervariable;
	private String rtusrdatastoragenone;
	private String rtusrdatastoragevariable;
	private String rtusrdatastoragefile;

	
	public String getrtapplication() {
	return rtapplication;
	}
	public void setrtapplication(String rtapplication) {
		this.rtapplication = rtapplication;
	}
	
	public String getrtinfile() {
	return rtinfile;
	}
	public void setrtinfile(String rtinfile) {
		this.rtinfile = rtinfile;
	}
	
	public String getrtopfile() {
	return rtopfile;
	}
	public void setrtopfile(String rtopfile) {
		this.rtopfile = rtopfile;
	}
	
	public String getrttimeout() {
	return rttimeout;
	}
	public void setrttimeout(String rttimeout) {
		this.rttimeout = rttimeout;
	}
	
	public String getrtheadervariable() {
	return rtheadervariable;
	}
	public void setrtheadervariable(String rtheadervariable) {
		this.rtheadervariable = rtheadervariable;
	}
	
	public String getrtusrdatastoragenone() {
	return rtusrdatastoragenone;
	}
	public void setrtusrdatastoragenone(String rtusrdatastoragenone) {
		this.rtusrdatastoragenone = rtusrdatastoragenone;
	}
	
	public String getrtusrdatastoragevariable() {
	return rtusrdatastoragevariable;
	}
	public void setrtusrdatastoragevariable(String rtusrdatastoragevariable) {
		this.rtusrdatastoragevariable = rtusrdatastoragevariable;
	}
	
	public String getrtusrdatastoragefile() {
	return rtusrdatastoragefile;
	}
	public void setrtusrdatastoragefile(String rtusrdatastoragefile) {
		this.rtusrdatastoragefile = rtusrdatastoragefile;
	}	
	
	/////Variable assignment /////////////
	
	private String vasvariablename; 
	private String vasvariablevalue; 
	private boolean vasevalexp; 
	
	public String getvasvariablename() {
	return vasvariablename;
	}
	public void setvasvariablename(String vasvariablename) {
		this.vasvariablename = vasvariablename;
	}
	
	public String getvasvariablevalue() {
	return vasvariablevalue;
	}
	public void setvasvariablevalue(String vasvariablevalue) {
		this.vasvariablevalue = vasvariablevalue;
	}
	
	public boolean isvasevalexp() {
		return vasevalexp;
	}
	public void setvasevalexp(boolean vasevalexp) {
		this.vasevalexp = vasevalexp;
	}
		
	
//**************FirstComposition********************
	private boolean scBindingMethgod;
	private String mainAppPackagelist;
	private String outputtypefile;
	private boolean ArchivePackageBtn;
	private String Retcode;
	private String CustomSwitchExp;
	private String varsetlist;
	private String fcaddsymfileexp;
	private String fcfilemaptype;
	private String fcvariabletype;
	
	
	
	public boolean isscBindingMethgod() {
		return scBindingMethgod;
	}
	public void setscBindingMethgod(boolean scBindingMethgod) {
		this.scBindingMethgod = scBindingMethgod;
	}
	
	
	public String getmainAppPackagelist() {
		return mainAppPackagelist;
	}
	public void setmainAppPackagelist(String mainAppPackagelist) {
		this.mainAppPackagelist = mainAppPackagelist;
	}
	
	public String getoutputtypefile() {
		return outputtypefile;
	}
	public void setoutputtypefile(String outputtypefile) {
		this.outputtypefile = outputtypefile;
	}
	
	public boolean isArchivePackageBtn() {
		return ArchivePackageBtn;
	}
	public void setArchivePackageBtn(boolean ArchivePackageBtn) {
		this.ArchivePackageBtn = ArchivePackageBtn;
	}	
	
	public String getRetcode() {
		return Retcode;
	}
	public void setRetcode(String Retcode) {
		this.Retcode = Retcode;
	}
	
	public String getCustomSwitchExp() {
		return CustomSwitchExp;
	}
	public void setCustomSwitchExp(String CustomSwitchExp) {
		this.CustomSwitchExp = CustomSwitchExp;
	}
	
	public String getvarsetlist() {
		return varsetlist;
	}
	public void setvarsetlist(String varsetlist) {
		this.varsetlist = varsetlist;
	}

	public String getfcaddsymfileexp() {
		return fcaddsymfileexp;
	}
	public void setfcaddsymfileexp(String fcaddsymfileexp) {
		this.fcaddsymfileexp = fcaddsymfileexp;
	}
	
	public String getfcfilemaptype() {
		return fcfilemaptype;
	}
	public void setfcfilemaptype(String fcfilemaptype) {
		this.fcfilemaptype = fcfilemaptype;
	}
	
	public String getfcvariabletype() {
		return fcvariabletype;
	}
	public void setfcvariabletype(String fcvariabletype) {
		this.fcvariabletype = fcvariabletype;
	}
	
	//**************FirstComposition Update********************
		
	
//**************DataValidation********************
	private String DatafilepathExp;
	private String ValidationType;
	private String ValidationTextExp;

	
	
	public String getDatafilepathExp() {
		return DatafilepathExp;
	}
	public void setDatafilepathExp(String DatafilepathExp) {
		this.DatafilepathExp = DatafilepathExp;
	}
	
	public String getValidationType() {
		return ValidationType;
	}
	public void setValidationType(String ValidationType) {
		this.ValidationType = ValidationType;
	}
	
	public String getValidationTextExp() {
		return ValidationTextExp;
	}
	public void setValidationTextExp(String ValidationTextExp) {
		this.ValidationTextExp = ValidationTextExp;
	}
	
//**************FileManagement********************
//FileManagement->AddOperation	
	
	private String ActionOnFileOrFolder;
	private String FileOrFolderNameExp;
	private String Copyto;
	private String Moveto;
	private boolean MoveDelRenameReadOnly;
	private boolean skipfileOrFolder;
	private boolean StopOrReportError;
	
	
	public String getActionOnFileOrFolder() {
		return ActionOnFileOrFolder;
	}
	public void setActionOnFileOrFolder(String ActionOnFileOrFolder) {
		this.ActionOnFileOrFolder = ActionOnFileOrFolder;
	}
	
	public String getFileOrFolderNameExp() {
		return FileOrFolderNameExp;
	}
	public void setFileOrFolderNameExp(String FileOrFolderNameExp) {
		this.FileOrFolderNameExp = FileOrFolderNameExp;
	}
	
	public String getCopyto() {
		return Copyto;
	}
	public void setCopyto(String Copyto) {
		this.Copyto = Copyto;
	}
	
	public String getMoveto() {
		return Moveto;
	}
	public void setMoveto(String Moveto) {
		this.Moveto = Moveto;
	}
	
	public boolean isMoveDelRenameReadOnly() {
		return MoveDelRenameReadOnly;
	}
	public void setMoveDelRenameReadOnly(boolean MoveDelRenameReadOnly) {
		this.MoveDelRenameReadOnly = MoveDelRenameReadOnly;
	}	
	
	public boolean isskipfileOrFolder() {
		return skipfileOrFolder;
	}
	public void setskipfileOrFolder(boolean skipfileOrFolder) {
		this.skipfileOrFolder = skipfileOrFolder;
	}	
	
	public boolean isStopOrReportError() {
		return StopOrReportError;
	}
	public void setStopOrReportError(boolean StopOrReportError) {
		this.StopOrReportError = StopOrReportError;
	}	
	
	
}
