package com.spittr.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;
import com.spittr.data.Spittle;
import com.spittr.data.SpittleRepository;import java.util.ArrayList;
import java.util.Date;import java.util.List;

import static org.hamcrest.Matchers.hasItems;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

/**
 * Created by Allen on 2016/4/17.
 */
public class spittleControllerTest {
    @Test
    public void shouldShowRecentSpittles() throws Exception {
        //此方法在下边定义
        List<Spittle> expectedSpittles = createSpittleList(20);
        SpittleRepository mocRepository = mock(SpittleRepository.class);
        when(mocRepository.findSpittles(Long.MAX_VALUE, 20))
                .thenReturn(expectedSpittles);
        SpittleController controller = new SpittleController(mocRepository);
        MockMvc mockMvc = standaloneSetup(controller)
                .setSingleView(new InternalResourceView("/WEB-INF/views/spittles.jsp"))
                .build();

        mockMvc.perform(get("/spittles"))
                .andExpect(view().name("spittles"))
                .andExpect(model().attributeExists("spittleList"))
                .andExpect(model().attribute("spittleList",
                        hasItems(expectedSpittles.toArray())));
    }

    private List<Spittle> createSpittleList(int count) {
        List<Spittle> spittles = new ArrayList<Spittle>();
        for (int i = 0; i < count; i++) {
            spittles.add(new Spittle("Spittle" + i, new Date()));
        }
        return spittles;
    }
}
