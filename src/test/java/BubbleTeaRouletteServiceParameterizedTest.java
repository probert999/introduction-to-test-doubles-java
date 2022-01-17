import com.techreturners.bubbleteaordersystem.model.BubbleTeaTypeEnum;
import com.techreturners.bubbleteaordersystem.service.BubbleTeaRouletteService;

import testhelper.RandomStub;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BubbleTeaRouletteServiceParameterizedTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {BubbleTeaTypeEnum.PeachIceTea.ordinal(), BubbleTeaTypeEnum.PeachIceTea},
                {BubbleTeaTypeEnum.JasmineMilkTea.ordinal(), BubbleTeaTypeEnum.JasmineMilkTea},
                {BubbleTeaTypeEnum.MatchaMilkTea.ordinal(), BubbleTeaTypeEnum.MatchaMilkTea},
                {BubbleTeaTypeEnum.PeachIceTea.ordinal(), BubbleTeaTypeEnum.PeachIceTea},
                {BubbleTeaTypeEnum.LycheeIceTea.ordinal(), BubbleTeaTypeEnum.LycheeIceTea}
        });
    }

    private final int input;
    private final BubbleTeaTypeEnum resultExpected;

    public BubbleTeaRouletteServiceParameterizedTest(final int input, final BubbleTeaTypeEnum result) {
        this.input = input;
        this.resultExpected = result;
    }

    @Test
    public void testBubbleTeaRouletteService() {
        RandomStub randomStub = new RandomStub(input);
        BubbleTeaRouletteService bubbleTeaRouletteService = new BubbleTeaRouletteService(randomStub);
        assertEquals(resultExpected, bubbleTeaRouletteService.getRandomBubbleTeaType());
    }


}

