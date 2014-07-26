package bogdan.imagefilters.effect.filter.instagram;

import bogdan.imagefilters.effect.filter.AbstractFilter;
import bogdan.imagefilters.effect.util.Pixel;

public class Hefe extends AbstractFilter {

	private static final int[][] kRGBMap = {
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,2,2,2,2,3,3,3,3,4,4,5,5,6,7,7,8,9,9,10,10,11,12,12,13,14,14,15,16,17,18,19,20,21,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,37,38,39,40,41,42,43,44,46,47,49,50,52,53,55,56,58,60,61,63,64,66,67,69,71,72,74,76,78,80,81,83,85,87,89,90,92,94,96,98,100,101,103,105,107,109,110,112,114,116,118,119,121,123,125,127,129,130,132,134,136,138,140,142,144,145,147,149,151,153,155,157,159,160,162,164,166,168,169,171,173,175,177,178,180,182,184,186,188,188,189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,203,203,203,204,204,204,205,205,205,206,206,206,207,207,207,208,208,208,209,209,210,210,211,211,211,212,212,213,213,214,214,215,215,215,215,216,216,216,217,217,217,218,218,218,219,219,219,220,220,220,221,221,222,222,223,223,223,224,224,225,225,226,226,227,227,228,228,229,229,230,230,231,231,232,232,233,233,234,234},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,3,3,4,4,4,5,5,6,6,7,7,8,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,28,29,30,32,33,34,36,37,38,40,41,42,44,45,47,49,51,53,55,57,59,60,62,64,66,68,70,72,74,76,78,80,82,84,87,89,91,93,95,98,100,102,104,106,109,110,112,114,116,118,120,122,124,126,128,130,132,134,136,138,140,141,143,145,147,149,151,153,155,157,159,161,163,165,167,169,171,172,174,175,177,178,180,181,183,185,186,188,189,191,192,194,196,196,197,198,199,200,201,202,203,203,204,205,206,207,208,209,210,210,211,211,212,212,213,213,214,215,215,216,216,217,217,218,219,219,219,220,220,221,221,222,222,222,223,223,224,224,225,225,226,226,227,227,228,228,229,229,230,230,231,231,232,232,233,233,234,234,234,235,235,236,236,237,237,237,238,238,239,239,240,240,241,241,242,242,243,243,244,244,245,246,246,247,247,248,248,249,250,250,250,250,251,251,251,252,252,252,253,253,253,254,254,254},
			{35,35,35,35,35,35,35,35,34,34,34,34,34,34,34,34,33,33,34,35,35,36,37,37,38,39,39,40,41,41,42,43,44,45,47,48,50,51,53,54,56,58,59,61,62,64,65,67,69,70,72,74,76,77,79,81,83,84,86,88,90,91,93,95,97,98,100,102,104,105,107,109,111,112,114,116,118,119,121,123,125,126,128,129,131,132,134,135,137,139,140,142,143,145,146,148,150,151,153,154,156,157,159,160,162,164,165,167,168,170,171,173,175,176,177,178,179,180,181,182,184,185,186,187,188,189,190,191,193,193,194,195,195,196,197,197,198,199,199,200,201,201,202,203,204,204,205,206,207,208,208,209,210,211,212,212,213,214,215,216,217,217,218,218,219,219,220,220,221,221,222,222,223,223,224,224,225,225,225,225,226,226,226,227,227,227,228,228,228,229,229,229,230,230,231,231,232,232,233,233,234,234,235,235,236,236,237,237,238,238,238,239,239,239,240,240,241,241,241,242,242,242,243,243,244,244,244,245,245,246,246,247,247,247,248,248,249,249,250,250,251,251,251,251,252,252,252,252,253,253,253,253,254,254,254,254}
		};
	
	@Override
	public Pixel process(Pixel rgba) {
		
		rgba.setR( kRGBMap[0][rgba.getR()] );
		rgba.setG( kRGBMap[1][rgba.getG()] );
		rgba.setB( kRGBMap[2][rgba.getB()] );
		
		return rgba;
	}

}
