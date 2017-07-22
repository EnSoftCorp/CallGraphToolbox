package com.ensoftcorp.open.cg.smart;

import com.ensoftcorp.atlas.core.query.Q;
import com.ensoftcorp.open.cg.analysis.HybridTypeAnalysis;

public class XTACallGraphSmartView extends CallGraphSmartView {
	
	@Override
	public String getTitle() {
		return "XTA Call Graph";
	}

	@Override
	protected Q getCallGraph(boolean enableCallGraphConstruction) {
		HybridTypeAnalysis xta = HybridTypeAnalysis.getInstance(enableCallGraphConstruction);
		if(!xta.hasRun()){
			xta.run();
		}
		return xta.getCallGraph();
	}

}
