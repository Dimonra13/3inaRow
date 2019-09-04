package threeInARow;
import controler.ChangePanelLis;
import controler.ChangePanelResetGameLis;
import controler.ColorListener;
import controler.setValueCheckWin;
import model.Board;
import view.BaseFrame;
import view.GameScreen;
import view.SettingsScreen;
import view.StartScreen;
import view.WinnerScreen;

public class Exe {
	public static void main(String[] args) {
		Board b = new Board();
		ChangePanelLis cplMenuSet = new ChangePanelLis(); 
		ChangePanelLis cplSetMenu = new ChangePanelLis(); 
		ChangePanelLis cplMenuStart = new ChangePanelLis();
		ChangePanelLis cplWinMenu = new ChangePanelLis();
		setValueCheckWin svc = new setValueCheckWin(b);
		ChangePanelResetGameLis cpr = new ChangePanelResetGameLis(b);
		ChangePanelResetGameLis cprRestart = new ChangePanelResetGameLis(b);
		ColorListener cl = new ColorListener();
		StartScreen ss = new StartScreen(cplMenuSet,cplMenuStart);
		SettingsScreen sets = new SettingsScreen(cplSetMenu,cl);
		GameScreen gs = new GameScreen(cpr,svc);
		WinnerScreen ws = new WinnerScreen(cplWinMenu,cprRestart);
		cplMenuSet.setOrigin(ss);
		cplMenuSet.setDetination(sets);
		cplSetMenu.setOrigin(sets);
		cplSetMenu.setDetination(ss);
		cplMenuStart.setOrigin(ss);
		cplMenuStart.setDetination(gs);
		cplWinMenu.setOrigin(ws);
		cplWinMenu.setDetination(ss);
		svc.setOrigin(gs);
		svc.setDetination(ws);
		cpr.setOrigin(gs);
		cpr.setDetination(ss);
		cprRestart.setOrigin(ws);
		cprRestart.setDetination(gs);
		cl.addPanels(ss);
		cl.addPanels(sets);
		cl.addPanels(gs);
		cl.addPanels(ws);
		BaseFrame bf = new BaseFrame();
		bf.add(sets);
		bf.add(ss);
		bf.add(gs);
		bf.add(ws);
		b.addObserver(gs);
	}
}
