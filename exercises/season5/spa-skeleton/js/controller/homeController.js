import homeView from '../view/homeView.js';
import timeService from '../service/timeService.js';

export function init() {
    homeView.render(timeService.getTimes);
}
